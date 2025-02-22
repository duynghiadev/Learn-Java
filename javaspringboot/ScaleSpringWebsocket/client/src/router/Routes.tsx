import { createBrowserRouter } from "react-router-dom";
import RequireAuth from "./RequireAuth";
import HomeLayout from "../common/layout/HomeLayout";
import ChatPage from "../features/chat/ChatPage";
import LoginPage from "../features/login/LoginPage";

export const router = createBrowserRouter([
    {
        path: '/',
        element: <HomeLayout />,
        children: [
            {
                element: <RequireAuth />, children: [
                    { index: true, element: <ChatPage /> },
                    // { path: 'detail/:id', element: <DetailPage /> },
                ]
            },

            // admin routes
            // {element: <RequireAuth roles={['Admin']} />, children: [
            //     {path: 'inventory', element: <Inventory />},
            // ]},           
            { path: 'login', element: <LoginPage /> },
            // { path: 'not-found', element: <NotFoundPage /> },
            // { path: '*', element: <Navigate replace to='/not-found' /> }
        ]
    },
])