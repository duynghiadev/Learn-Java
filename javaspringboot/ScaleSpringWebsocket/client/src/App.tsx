import './App.css';
import { CssBaseline } from '@mui/material';
import { ToastContainer } from 'react-toastify';
import { RouterProvider } from 'react-router-dom';
import { router } from './router/Routes';


function App() {
  return (
    <>
      <CssBaseline />
      <ToastContainer position='top-right' hideProgressBar theme='colored' />
      <RouterProvider router={router} />
    </>
  );
}

export default App;
