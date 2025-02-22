import Container from "@mui/material/Container";
import Header from "../components/Header";
import { Outlet } from "react-router-dom";


export default function HomeLayout() {
    return (
        <>
            <Header />
            <Container sx={{ mt: 4 }}>
                <Outlet />
            </Container>
        </>
    );
}