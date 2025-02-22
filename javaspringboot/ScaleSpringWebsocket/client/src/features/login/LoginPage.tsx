import { Avatar, Box, Button, Container, Link, TextField, Typography } from "@mui/material";
import Grid from '@mui/material/Grid2';
import { LockOutlined } from "@mui/icons-material";
import { useFormik } from "formik";
import * as yup from 'yup';
import { store } from "../../stores/stores";
import { router } from "../../router/Routes";


export default function LoginPage() {
    const validationSchema = yup.object().shape({
        username: yup.string().required('Username is required'),
        password: yup.string().required('Password is required')
            .min(6, 'Password should be of minimum 6 characters length').max(128, 'Password maximum 128 charactor'),
    });

    const formik = useFormik({
        initialValues: {
            username: '',
            password: '',
        },
        validationSchema: validationSchema,
        onSubmit: (values, actions) => {
            store.authStore.login(values.username, values.password)
                .then(() => router.navigate('/'))
                .catch((err: any) => {
                    actions.setSubmitting(false)
                })
        },
    });

    return (
        <Container component="main" maxWidth="xs">
            <Box
                sx={{
                    marginTop: 8,
                    display: 'flex',
                    flexDirection: 'column',
                    alignItems: 'center',
                }}
            >
                <Avatar sx={{ m: 1, bgcolor: 'secondary.main' }}>
                    <LockOutlined />
                </Avatar>
                <Typography component="h1" variant="h5">
                    Sign in
                </Typography>

                <Box sx={{ mt: 1 }}>

                    <form onSubmit={formik.handleSubmit}>
                        <TextField
                            margin="normal"
                            fullWidth
                            id="username"
                            name="username"
                            label="username"
                            value={formik.values.username}
                            onChange={formik.handleChange}
                            onBlur={formik.handleBlur}
                            error={formik.touched.username && Boolean(formik.errors.username)}
                            helperText={formik.touched.username && formik.errors.username}
                        />
                        <TextField
                            margin="normal"
                            fullWidth
                            id="password"
                            name="password"
                            label="Password"
                            type="password"
                            value={formik.values.password}
                            onChange={formik.handleChange}
                            onBlur={formik.handleBlur}
                            error={formik.touched.password && Boolean(formik.errors.password)}
                            helperText={formik.touched.password && formik.errors.password}
                        />

                        {/* <FormControlLabel
                            control={<Checkbox value="remember" color="primary" />}
                            label="Remember me"
                        /> */}
                        <Button
                            fullWidth
                            variant="contained"
                            sx={{ mt: 3, mb: 2 }}
                            disabled={formik.isSubmitting || !formik.dirty || !formik.isValid}
                            type="submit">
                            {formik.isSubmitting ? 'Loading...' : 'Sign In'}
                        </Button>
                    </form>

                    <Grid container>
                        <Grid>
                            <Link href="#" variant="body2">
                                Forgot password?
                            </Link>
                        </Grid>
                        <Grid>
                            <Link href="#" variant="body2">
                                {"Don't have an account? Sign Up"}
                            </Link>
                        </Grid>
                    </Grid>
                </Box>
            </Box>
            <Copyright sx={{ mt: 8, mb: 4 }} />
        </Container>
    )
}

function Copyright(props: any) {
    return (
        <Typography variant="body2" color="text.secondary" align="center" {...props}>
            {'Copyright © '}
            <Link color="inherit" href="https://mui.com/">
                Your Website
            </Link>{' '}
            {new Date().getFullYear()}
            {'.'}
        </Typography>
    );
}