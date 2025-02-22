import {
    AppBar,
    Badge,
    IconButton,
    Menu,
    MenuItem,
    Toolbar,
    Typography,
    TextField,
    Button,
    Tooltip,
    Avatar
} from "@mui/material";
import { Box } from "@mui/system";
import { Link, NavLink } from "react-router-dom";
import { Notifications, Email } from "@mui/icons-material";
import { useState } from "react";
import { store, useStore } from "../../stores/stores";
import { observer } from 'mobx-react-lite';
import React from "react";

const navStyles = {
    color: 'inherit',
    textDecoration: 'none',
    typography: 'h6',
    '&:hover': {
        color: 'grey.500'
    },
    '&.active': {
        color: 'text.secondary'
    }
}

export default observer(function Header() {
    const { chatStore: { disConnect }, authStore: { logout } } = useStore()
    const [anchorElUser, setAnchorElUser] = useState<null | HTMLElement>(null);
    const handleOpenUserMenu = (event: React.MouseEvent<HTMLElement>) => {
        setAnchorElUser(event.currentTarget);
    };

    const handleCloseUserMenu = () => {
        setAnchorElUser(null);
    };

    return (
        <AppBar position='static'>
            <Toolbar sx={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center' }}>

                <Box display='flex' alignItems='center'>
                    <Typography style={{ color: 'white' }} variant="h6" component={NavLink}
                        to='/'
                        sx={navStyles}
                    >
                        mxh12
                    </Typography>
                </Box>

                <Box display='flex' alignItems='center'>

                    {
                        store.authStore.user === null ? (
                            <Box>
                                <Button
                                    size="small"
                                    variant="contained"
                                    color="secondary"
                                    style={{ marginRight: 5 }}
                                    component={Link}
                                    to={'/login'}
                                >Login</Button>

                                <Button
                                    size="small"
                                    variant="contained"
                                    color="secondary"
                                    style={{ marginRight: 5 }}
                                    component={Link}
                                    to={'/login/register'}
                                >Register</Button>
                            </Box>
                        ) : (
                            <div>
                                <Tooltip title={store.authStore.user?.displayName}>
                                    <IconButton onClick={handleOpenUserMenu} sx={{ p: 0 }}>
                                        <Avatar alt={store.authStore.user?.displayName} src={'./assets/user.png'} />
                                    </IconButton>
                                </Tooltip>

                                <Menu
                                    sx={{ mt: '45px' }}
                                    id="menu-appbar"
                                    anchorEl={anchorElUser}
                                    anchorOrigin={{
                                        vertical: 'top',
                                        horizontal: 'right',
                                    }}
                                    keepMounted
                                    transformOrigin={{
                                        vertical: 'top',
                                        horizontal: 'right',
                                    }}
                                    open={Boolean(anchorElUser)}
                                    onClose={handleCloseUserMenu}
                                >
                                    <MenuItem onClick={handleCloseUserMenu}>My account</MenuItem>
                                    <MenuItem onClick={handleCloseUserMenu}>Profile</MenuItem>
                                    <MenuItem onClick={() => {
                                        logout()
                                        disConnect()
                                    }}>logout</MenuItem>
                                </Menu>
                            </div>
                        )
                    }

                </Box>
            </Toolbar>
        </AppBar>
    )
})