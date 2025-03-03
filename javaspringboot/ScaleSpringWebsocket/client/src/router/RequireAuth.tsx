import { Navigate, Outlet, useLocation } from "react-router-dom";
import { useStore } from "../stores/stores";
import { toast } from "react-toastify";

interface Props {
    roles?: string[];
}

export default function RequireAuth({roles}: Props) {
    const { authStore: { user } } = useStore()
    const location = useLocation();

    if (!user) {
        toast.error('Not authorised to access this area');
        return <Navigate to='/login' state={{from: location}} />
    }

    // if (roles && !roles.some(r => user.roles?.includes(r))) {
    //     toast.error('Not authorised to access this area');
    //     return <Navigate to='/catalog' />
    // }

    return <Outlet />
}