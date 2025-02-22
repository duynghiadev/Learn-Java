import MessageList from "./MessageList";
import { observer } from "mobx-react-lite";
import Grid from '@mui/material/Grid2';

export default observer(function ChatPage() {

    return <Grid container spacing={2}>
        <Grid >
            <MessageList />
        </Grid>
    </Grid>
})