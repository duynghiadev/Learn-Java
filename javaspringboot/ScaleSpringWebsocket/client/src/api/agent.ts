import axios, { AxiosError, AxiosResponse } from "axios";
import { toast } from "react-toastify";
import { router } from "../router/Routes";
import { store } from "../stores/stores";


const sleep = () => new Promise(resolve => setTimeout(resolve, 1000))

axios.defaults.baseURL = process.env.REACT_APP_API_URL;
axios.defaults.withCredentials = true;

axios.interceptors.request.use(config => {
    const token = store.authStore.token;
    if (token) config.headers.Authorization = `Bearer ${token}`;
    return config;
})

axios.interceptors.response.use(async response => {
    if (process.env.NODE_ENV === 'development') await sleep();
    // const pagination = response.headers['pagination'];
    // if (pagination) {
    //     response.data = new PaginatedResponse(response.data, JSON.parse(pagination));
    //     return response;
    // }
    return response
}, (error: AxiosError) => {
    const { data, status } = error.response as AxiosResponse;
    switch (status) {
        case 400:
            // const modelStateErrors: string[] = data.message.split(',')
            // if(modelStateErrors.length > 1){
            //     throw modelStateErrors.flat();
            // }
            toast.error(data.message, { toastId: data.message });
            break;
        case 401:
            toast.error(data.message, { toastId: data.message });
            break;
        case 403:
            toast.error('You are not allowed to do that!', { toastId: '403' });
            break;
        case 404:
            toast.error(data.message, { toastId: data.message });
            break;
        case 500:
            //store.commonStore.setServerError(data);
            router.navigate('/server-error');
            break;
        default:
            toast.error('Have a error, see console log');
            break;
    }

    return Promise.reject(error);
})

const responseBody = <T>(response: AxiosResponse<T>) => response.data;

const requests = {
    get: <T>(url: string) => axios.get<T>(url).then(responseBody),
    post: <T>(url: string, body: {}) => axios.post<T>(url, body).then(responseBody),
    put: <T>(url: string, body: {}) => axios.put<T>(url, body).then(responseBody),
    delete: <T>(url: string) => axios.delete<T>(url).then(responseBody),
}


const Auth = {
    login: (user: { username: string, password: string }) => requests.post<any>('/account/login', user),
}

const Error = {
    badRequest: () => requests.get('/error/BadRequest'),
    notFound: () => requests.get('/error/NotFound'),
    unauthorized: () => requests.get('/error/Unauthorized'),
    forbidden: () => requests.get('/error/Forbidden'),
    validation: () => requests.get('/error/Validation'),
    serverError: () => requests.get('/error/ServerError'),
}

const agent = {
    Auth,
    Error,
}

export default agent;