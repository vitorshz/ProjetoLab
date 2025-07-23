
# Sistema de Gestão Laboratorial - TCC

Este projeto foi desenvolvido como Trabalho de Conclusão de Curso (TCC) do curso de Análise e Desenvolvimento de Sistemas na Unipar. Ele consiste em um sistema completo para laboratórios de análises clínicas, com foco na gestão de exames e no acesso dos pacientes aos seus resultados.

## 🧩 Visão Geral

O sistema é dividido em duas partes principais:

* **Aplicação Desktop (Java Swing + Hibernate + PostgreSQL):** Utilizada internamente pelo operador do laboratório para gerenciar cadastros, registrar exames e gerar relatórios.

* **Portal Web (Spring Boot + Thymeleaf):** Website institucional do laboratório, com acesso restrito para os pacientes consultarem seus exames de forma segura, além de uma seção de contato.

---

## 🖥️ Aplicação Desktop

### Tecnologias: `Java Swing`, `Hibernate (JPA)`, `PostgreSQL`

A aplicação desktop é voltada para uso interno do laboratório, permitindo a gestão completa dos dados clínicos.

### Funcionalidades principais:

* **Cadastro:**

  * Pacientes
  * Médicos
  * Convênios
  * Exames laboratoriais

* **Gestão de Exames:**

  * Registro e alteração de exames solicitados
  * Inclusão dos resultados de cada exame
  * Impressão dos resultados para entrega física
  * Envio de resultados para o portal do paciente (se desejado)

* **Relatórios:**

  * Geração de relatórios administrativos
  * Impressão de laudos

---

## 🌐 Portal Web (Spring + Thymeleaf)

### Tecnologias: `Spring Boot`, `Thymeleaf`, `HTML/CSS`

Este é o site institucional do laboratório com acesso ao **portal do paciente**.

### Funcionalidades:

* Página inicial com informações do laboratório
* Página "Entre em Contato"
* Área do paciente:

* Autenticação com cpf e senha
* Exibição de selos e certificados de qualidade

---

## ⚙️ Tecnologias Utilizadas

| Camada         | Tecnologias                      |
| -------------- | -------------------------------- |
| Desktop        | Java, Swing, Hibernate, JPA      |
| Web            | Spring Boot, Thymeleaf, HTML/CSS |
| Banco de Dados | PostgreSQL                       |

---



