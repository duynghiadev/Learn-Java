import { makeObservable, observable, action } from "mobx";
import { toast } from "react-toastify";



export default class ChatStore {
    socket: WebSocket | null = null;
    messages: any[] = []

    constructor() {
        makeObservable(this, {
            messages: observable,
            connnect: action,
            disConnect: action,
        })
    }

    connnect = (token: string) => {
        this.socket = new WebSocket(`ws://localhost:8081/findtheway?token=${token}`);
        this.socket.onopen = () => {
            console.log("Connected to WebSocket");
            //socket.send(JSON.stringify({type:HEARTBEAT, data: 'ok'}))
        };

        this.socket.onmessage = (event) => {
            var payload: any = JSON.parse(event.data);
            this.messages.push(payload.data)
        };

        this.socket.onclose = (event) => {
            toast.warn(`close socket code=${event.code}`)
            console.warn(event);
        };

        this.socket.onerror = (error: any) => {
            console.error("WebSocket error: ", error);
            toast.error("WebSocket error: " + error.message);
        };
    }

    send = (data: string) => {
        this.socket?.send(data);
    }

    disConnect = () => {
        this.socket?.close()
    }
}