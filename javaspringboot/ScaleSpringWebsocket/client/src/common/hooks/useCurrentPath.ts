import {
    useLocation
} from "react-router-dom";


export default function useCurrentPath() {
    const location = useLocation();
    return location.pathname;
}

//https://stackoverflow.com/questions/66265608/react-router-v6-get-path-pattern-for-current-route
// With React Router v6:

// import { matchPath, useLocation } from "react-router-dom";

// const routes = ["/", "/login", "product", "product/:id"];

// const usePathPattern = (): string | undefined => {
//   const { pathname } = useLocation();
//   return routes.find((route) => matchPath(route, pathname));
// };