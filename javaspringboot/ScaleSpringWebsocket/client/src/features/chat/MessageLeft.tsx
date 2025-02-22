import { Box } from "@mui/material";
import { IMessage } from "../../models/message";

interface Props {
    msg: any
}

export default function MessageLeft({ msg }: Props) {
    return <div style={{
        marginBottom: 10,
        display: 'flex'
    }}>
        <Box>
            <div style={{ fontSize: 15, color: 'blue' }}>{'anymous'}</div>

            <div style={{
                maxWidth: '85%',
                backgroundColor: '#c4c4fc',
                padding: 15,
                borderRadius: 15,
                fontSize: 15
            }}>
                {msg}
            </div>
        </Box>
    </div>
}