import { Container } from "@mui/material";
import Header from "../components/Header";
import { Outlet } from "react-router-dom";

export default function ChatLayout() {
    return (
        <>
            <Header />
            <Container sx={{ mt: 4 }}>
                <Outlet />
            </Container>
        </>
    );
}