# 🗓️ App de Turnos – Backend

Aplicación backend para la gestión de turnos entre clientes y profesionales.  
El proyecto está enfocado en **buen diseño orientado a objetos**, separación de responsabilidades y arquitectura típica de backend (**Controller – Service – Repository**).

Este repositorio muestra la **evolución del proyecto**, comenzando por la lógica de negocio en POO y avanzando progresivamente hacia una API REST con Spring Boot, persistencia con MySQL/JPA y testing.

---

## 🚀 Funcionalidades actuales

- Crear turnos entre clientes y profesionales
- Validaciones de negocio mediante **criterios**
- Arquitectura en capas:
  - Controller
  - Service
  - Repository
- Uso de DTO para recibir datos desde la API
- Estados del dominio modelados con enum

---

## 🧠 Reglas de negocio (criterios)

Antes de crear un turno, se validan las siguientes reglas:

- ✅ El cliente debe estar **ACTIVO**
- ⛔ No se puede crear un turno en una **fecha y hora pasada**
- ⛔ El cliente no puede tener otro turno **activo en la misma fecha y hora**

Estas reglas están encapsuladas en una estructura de **criterios reutilizables**, desacopladas del controller y del repository.

---

## 🧩 Modelo de dominio

### Cliente
- id
- nombre
- dni
- estado (ACTIVO / INACTIVO)
- lista de reservas

### Profesional
- id
- nombre
- especialidad
- estado (ACTIVO / INACTIVO)

### Reserva
- id
- profesional
- fecha
- hora
- estado (ACTIVA / CANCELADA / FINALIZADA)

---

## 🏗️ Arquitectura
### 📌 Responsabilidades

- **Controller**
  - Expone endpoints REST
  - Recibe datos mediante DTO
- **Service**
  - Orquesta el flujo de la operación
  - Coordina repositorios y lógica de negocio
- **ServicioTurnos**
  - Contiene la lógica pura del dominio
  - Aplica criterios de validación
- **Repository**
  - Maneja el almacenamiento (actualmente en memoria)

---

## 📥 Endpoint disponible

### Crear reserva 
**Body (JSON):**

json
{
  "fecha": "2026-01-20",
  "hora": "10:30",
  "idCliente": 1,
  "idProfesional": 2
}
## 🔮 Próximos pasos

- Migrar a Spring Boot
- Exponer API REST funcional
- Persistencia con MySQL + JPA/Hibernate
- Implementar cancelación de turnos
- Agregar tests unitarios con JUnit y Mockito
