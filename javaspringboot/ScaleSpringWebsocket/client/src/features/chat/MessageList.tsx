import Card from '@mui/material/Card';
import CardHeader from '@mui/material/CardHeader';
import CardContent from '@mui/material/CardContent';
import Avatar from '@mui/material/Avatar';
import IconButton from '@mui/material/IconButton';
import { red } from '@mui/material/colors';
import MoreVertIcon from '@mui/icons-material/MoreVert';
import { TextField } from '@mui/material';
import MessageLeft from './MessageLeft';
import MessageRight from './MessageRight';
import { useEffect, useRef, useState } from 'react';
import { observer } from 'mobx-react-lite';
import { store, useStore } from '../../stores/stores';
import { IMessage } from '../../models/message';


export default observer(function MessageList() {
    const { chatStore: { messages, send } } = useStore()
    const [content, setContent] = useState('')
    const endRef = useRef<any>(null)

    useEffect(() => {
        endRef.current.scrollIntoView({ behavior: "smooth" })
    }, [messages.length])


    function sendMessage(e: any) {
        if (e.key === 'Enter' && content.trim() !== '') {
            send(content)
            setContent('')
        }
    }

    return (<Card sx={{ height: 'calc(100vh - 120px)', width: '100vh' }}>
        <CardHeader
            avatar={
                <Avatar sx={{ bgcolor: red[500] }} aria-label="recipe">
                    R
                </Avatar>
            }
            action={
                <IconButton aria-label="settings">
                    <MoreVertIcon />
                </IconButton>
            }
            title={'hello'}
            subheader={''}
        />

        <CardContent sx={{ height: 'calc(100% - 140px)', overflowY: 'scroll' }}>
            {
                messages.map((msg, index) => <MessageLeft key={index} msg={msg} />)
            }
            <div ref={endRef}></div>
        </CardContent>

        <TextField
            fullWidth
            label="Enter to send message"
            variant="outlined"
            onKeyDown={sendMessage}
            onChange={e => setContent(e.target.value)}
            value={content} />
    </Card>
    );
})