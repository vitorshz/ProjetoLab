document.getElementById("login-form").addEventListener("submit", function (event) {
    event.preventDefault();

    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;

    axios.post('http://localhost:8080/api/auth/login', {
        username: username,
        password: password
    })
    .then(function (response) {
        alert('Login bem-sucedido!');
        localStorage.setItem('jwt_token', response.data);  // Armazena o token
        window.location.href = '/dashboard.html';  // Redireciona para outra página
    })
    .catch(function (error) {
        alert('Erro ao realizar login!');
    });
});
