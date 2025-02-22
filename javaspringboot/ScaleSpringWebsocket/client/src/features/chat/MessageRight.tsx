import { Box } from "@mui/material";
import { IMessage } from "../../models/message";

interface Props {
    msg: IMessage
}

export default function MessageRight({ msg }: Props) {
    return <div style={{
        marginBottom: 10
    }}>
        <Box sx={{ display: 'flex', justifyContent: 'flex-end' }}>
            <div style={{
                maxWidth: '85%',
                backgroundColor: '#c15b4e',
                padding: 15,
                borderRadius: 15,
                color: 'white',
                fontSize: 15
            }}>
                {msg.content}
            </div>
        </Box>
    </div>
}