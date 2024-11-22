// document.getElementById("login-form").addEventListener("submit", function (event) {
//     event.preventDefault();
//
//     let username = document.getElementById("username").value;
//     let password = document.getElementById("password").value;
//
//     axios.post('http://localhost:8080/api/auth/login', {
//         username: username,
//         password: password
//     })
//     .then(function (response) {
//         alert('Login bem-sucedido!');
//         localStorage.setItem('jwt_token', response.data);  // Armazena o token
//         window.location.href = '/dashboard.html';  // Redireciona para outra página
//     })
//     .catch(function (error) {
//         alert('Erro ao realizar login!');
//     });
// });
document.getElementById("login-form").addEventListener("submit", async (event) => {
    event.preventDefault();

    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    try {
        const response = await axios.post("/api/auth/login", {
            username,
            password,
        });

        if (response.status === 200) {
            alert("Login bem-sucedido!");
            window.location.href = "/"; // Redireciona para a página principal
        }
    } catch (error) {
        alert("Falha no login: " + error.response.data);
    }
});
