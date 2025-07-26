# 🎟️ Event Ticket Booking Platform

A full-stack event ticket booking platform where users can create, buy, and manage tickets for events. It features secure **role-based access** via **Keycloak**, a scalable backend built with **Spring Boot**, and a modern frontend using **React + Vite** and **Tailwind CSS**.

---

## 👥 User Roles & Permissions

### 🔸 Organizer
- Can **create**, **update**, and **delete** events
- Manages event details like title, date, venue details, ticket types, etc.

### 🔸 Staff
- Can **validate tickets** manually or by scanning **QR codes**
- Assists in managing attendees during event check-in

### 🔸 Attendee
- Can **browse events**, **buy tickets**, and **view their bookings**
- Receives tickets with QR codes for scanning

> 🎯 All authentication and authorization is powered by **Keycloak** (OIDC-based login).

---

## 🚀 Tech Stack

### ⚙️ Backend (Spring Boot)
- Java 21 + Spring Boot 3.5.3
- Spring Security + OAuth2 Resource Server (JWT)
- Spring Data JPA (PostgreSQL)
- MapStruct + Lombok
- ZXing for QR Code generation
- Docker & Docker Compose

### 🌐 Frontend (React + Vite + TypeScript)

- ⚛️ **React 19** with **Vite** for fast builds
- 🟦 **TypeScript** for robust, type-safe code
- 🎨 **Tailwind CSS** and **Radix UI** for modern, accessible components
- 🔐 **OIDC Authentication** using `react-oidc-context`
- 📷 **QR Code Scanner** with `@yudiel/react-qr-scanner`
- 🧭 **Routing** with React Router DOM 7
- 📅 Date and utility libraries: `date-fns`, `clsx`, `tailwind-merge`, and more

---

## ⚡️ Quick Start

Follow these steps to run the entire application locally.

Quick Start Guide: Event Ticket Booking Platform
How to Start the Application
Follow these steps to get your Event Ticket Booking Platform running:

Backend
In the backend terminal, run:

docker-compose up 

This will run the docker-compose.yml file to start the database, keycloak and keycloak adminer.

Then, clean, compile, and run the backend application:

then in Frontend section(vscode)

mvn clean install
mvn spring-boot:run

Frontend
In the frontend terminal, first install dependencies:

npm install 

Then, run the development server:

npm run dev
