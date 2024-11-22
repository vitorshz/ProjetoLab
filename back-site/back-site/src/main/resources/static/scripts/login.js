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

    // Verifica se os campos estão vazios
    if (!username || !password) {
        alert("Os campos 'Usuário' e 'Senha' não podem estar vazios.");
        return;
    }

    // Valida se o CPF nos dois campos é igual
    if (username !== password) {
        alert("Os campos 'Usuário' e 'Senha' devem conter o mesmo CPF!");
        return;
    }

    try {
        const response = await axios.post("/api/auth/login", { cpf: username });

        if (response.status === 200) {
            // Redirecionar para a página do paciente
            window.location.href = response.data;
        }
    } catch (error) {
        if (error.response) {
            alert("Falha no login: " + error.response.data);
        } else {
            alert("Erro inesperado. Por favor, tente novamente.");
        }
    }
});

function formatarCpf(cpf) {
    // Remove caracteres não numéricos
    cpf = cpf.replace(/\D/g, "");

    // Aplica a máscara ###.###.###-##
    cpf = cpf.replace(/(\d{3})(\d)/, "$1.$2");
    cpf = cpf.replace(/(\d{3})(\d)/, "$1.$2");
    cpf = cpf.replace(/(\d{3})(\d{1,2})$/, "$1-$2");

    return cpf;
}

document.getElementById("username").addEventListener("input", (event) => {
    event.target.value = formatarCpf(event.target.value);
});

document.getElementById("password").addEventListener("input", (event) => {
    event.target.value = formatarCpf(event.target.value);
});


