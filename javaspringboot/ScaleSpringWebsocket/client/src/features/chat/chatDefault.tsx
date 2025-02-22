import ChatBubbleIcon from '@mui/icons-material/ChatBubbleOutline';

export default function ChatDefault(){
    return <div style={{display: 'flex', flexDirection: 'column', alignItems: 'center', justifyContent:'center'}}>
        <h1 style={{color: 'blue'}}>You have no messages</h1>
        <ChatBubbleIcon style={{fontSize: 440}} />
    </div>
}