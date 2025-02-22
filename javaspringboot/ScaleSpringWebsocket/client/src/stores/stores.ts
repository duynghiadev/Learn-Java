import { createContext, useContext } from "react";
import AuthStore from "./authStore";
import ChatStore from "./chatStore";


interface Store {
    authStore: AuthStore;
    chatStore: ChatStore;
}

export const store: Store = {
    authStore: new AuthStore(),
    chatStore: new ChatStore()
}

export const StoreContext = createContext(store);

export function useStore() {
    return useContext(StoreContext);
}