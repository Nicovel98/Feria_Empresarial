# 🎡 Sistema de Gestión de Feria Empresarial

Aplicación en **Java** diseñada para la administración integral de eventos corporativos, permitiendo la gestión de expositores (**Empresas**), espacios físicos (**Stands**) y flujo de asistentes (**Visitantes**).

## 🎯 Objetivos del Proyecto
- Gestionar el registro de **Empresas**.
- Administrar la ocupación de **Stands** mediante relaciones de asociación 1:1.
- Implementar un **Módulo de Interacción** donde los visitantes califican y comentan su experiencia.
- Generar reportes sobre la satisfacción de los stands.

## 🛠️ Tecnologías Utilizadas
- **Lenguaje:** Java
- **Paradigma:** Programación Orientada a Objetos (POO).
- **Control de Versiones:** Git & GitHub

- **Modelado:** UML con énfasis en Agregación y Composición.

## 📐 Modelo de Datos y Relaciones
- **FeriaEmpresarial (Gestor):** Contiene las listas globales (Agregación).
- **Empresa & Stand:** Una empresa ocupa un único stand (Asociación).
- **Comentarios:** Pertenecen exclusivamente a una empresa (Composición). Si la empresa se elimina, sus comentarios también.

## 📊 Reportes Disponibles
El sistema permite generar:
1. Listado de empresas con sus stands asignados.
2. Historial de stands y empresas visitados por cada asistente.
3. Ranking de popularidad basado en el promedio de estrellas (1-5).

## 🚀 Instalación y Ejecución
1. Clonar vía SSH:
    ```bash
    git clone git@github.com:Nicovel98/Feria_Empresarial.git
    cd Feria_Empresarial
2. Compilación y ejecución en tu terminal:
   ```bash
   javac *.java
   java Main