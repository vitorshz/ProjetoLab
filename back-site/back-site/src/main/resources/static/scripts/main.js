// // Simula o login do usuário e inicia a sessão
// function initializeSession() {
//     // Simulação de dados retornados pela API
//     const mockUserData = {
//         name: "João Silva",
//         lastUpdate: "21/11/2024 - 14:30",
//         exams: [
//             { exame: "Hemograma", status: "Liberado", pdfUrl: "/exams/hemograma.pdf" },
//             { exame: "Urinálise", status: "Aguardando" }
//         ]
//     };
//
//     // Exibe os dados do paciente
//     document.getElementById("patient-name").textContent = `Paciente: ${mockUserData.name}`;
//     document.getElementById("last-update").textContent = `Última Atualização: ${mockUserData.lastUpdate}`;
//
//     // Renderiza os exames
//     renderExamResults(mockUserData.exams);
//
//     // Inicia o timer da sessão
//     startSessionTimer();
// }
//
// // Renderiza os exames na tabela
// function renderExamResults(results) {
//     const tableBody = document.querySelector("table tbody");
//     const noResultsDiv = document.getElementById("no-results");
//
//     if (results.length === 0) {
//         noResultsDiv.style.display = "block";
//         tableBody.innerHTML = ""; // Limpa a tabela
//     } else {
//         noResultsDiv.style.display = "none";
//         tableBody.innerHTML = results.map(result => `
//             <tr class="${result.status === 'Liberado' ? 'liberado' : 'aguardando'}">
//                 <td>${result.exame}</td>
//                 <td>${result.status}</td>
//                 ${result.status === 'Liberado' ? `<td><button class="btn-download" onclick="downloadPdf('${result.pdfUrl}')">Download PDF</button></td>` : '<td></td>'}
//             </tr>
//         `).join('');
//     }
// }
//
// // Função para baixar o PDF
// function downloadPdf(url) {
//     window.open(url, "_blank"); // Abre o PDF em outra guia
// }
//
// // Função para deslogar
// function logout() {
//     alert("Você foi deslogado com sucesso!");
//     window.location.href = "index.html"; // Redireciona para a página de login
// }
//
// // Timer para expirar a sessão após 60 minutos
// function startSessionTimer() {
//     const sessionTimeout = 60 * 60 * 1000; // 60 minutos em milissegundos
//     setTimeout(() => {
//         alert("Sua sessão expirou! Você será redirecionado para a página de login.");
//         logout();
//     }, sessionTimeout);
// }
//
// // Inicializa a sessão ao carregar a página
// document.addEventListener("DOMContentLoaded", initializeSession);

document.addEventListener("DOMContentLoaded", () => {
    loadPdfs();

    // Exemplo de logout (caso tenha lógica de sessão)
    document.querySelector(".btn-logout").addEventListener("click", logout);
});

function loadPdfs() {
    const tableBody = document.querySelector("table tbody");
    const noResults = document.getElementById("no-results");

    axios.get("/api/pdf/list")
        .then(response => {
            const pdfs = response.data;

            if (pdfs.length === 0) {
                noResults.style.display = "block";
                tableBody.innerHTML = "";
                return;
            }

            noResults.style.display = "none";
            tableBody.innerHTML = pdfs.map(pdf => `
                <tr>
                    <td>${pdf.fileName}</td>
                    <td>Disponível</td>
                    <td>
                        <a href="/api/pdf/download/${pdf.id}" target="_blank" class="btn-download">
                            Baixar
                        </a>
                    </td>
                </tr>
            `).join("");
        })
        .catch(error => {
            console.error("Erro ao carregar PDFs:", error);
            alert("Erro ao carregar PDFs. Por favor, tente novamente.");
        });
}

function logout() {
    alert("Sessão encerrada.");
    // Redirecionar ou realizar logout (ajustar conforme necessário)
    window.location.href = "/login";
}

