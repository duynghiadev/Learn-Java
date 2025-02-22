import { makeAutoObservable, reaction, runInAction } from "mobx";
import agent from "../api/agent";
import { IUser } from "../models/user";
import { store } from "./stores";


export default class AuthStore {
    user: IUser | null = JSON.parse(localStorage.getItem('user')!);
    token: string | null = localStorage.getItem('token');

    constructor() {
        makeAutoObservable(this);
        reaction(
            () => this.user,
            user => {
                if (user) {
                    localStorage.setItem('user', JSON.stringify(user))
                } else {
                    localStorage.removeItem('user')
                }
            }
        )

        reaction(
            () => this.token,
            token => {
                if (token) {
                    localStorage.setItem('token', token)
                } else {
                    localStorage.removeItem('token')
                }
            }
        )
    }

    login = async (username: string, password: string) => {
        try {
            const data = await agent.Auth.login({ username, password });
            console.log(data)
            runInAction(() => {
                this.token = data.token;
                this.user = data.user;
                store.chatStore.connnect(data.token)
            })
        } catch (error) {
            console.error(error)
            throw error
        }
    }

    logout = () => {
        runInAction(() => {
            this.user = null;
            this.token = null;
        })
    }
}