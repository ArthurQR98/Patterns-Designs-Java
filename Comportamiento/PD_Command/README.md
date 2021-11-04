# Patterns Desings -Command- with Java 🚀

El patrón Command tiene como objetivo transformar una solicitud en un objeto,
facilitando operaciones tales como la anulación, el encolamiento de solicitudes y su seguimiento.

## Use Case

* Un objeto debe configurarse para realizar un procesamiento concreto. En el caso
del patrón Command, es el solicitante el que se configura mediante una solicitud
que contiene la descripción de un procesamiento a realizar sobre uno o varios
receptores.
* Las solicitudes deben encolarse y poder ejecutarse en un momento cualquiera,
eventualmente varias veces.
* Las solicitudes pueden ser anuladas.
* Las solicitudes deben quedar registradas en un archivo de log.
* Las solicitudes deben estar reagrupadas bajo la forma de una transacción. Una
transacción es un conjunto ordenado de solicitudes que actúan sobre el estado de
un sistema y que pueden ser anuladas.


### Pre-requisitos 📋

* [Java](https://www.java.com/es/download/) 

## Construido con 🛠️

* [Java](https://www.java.com/es/download/)

## Licencia 📄

Este proyecto está bajo la Licencia - mira el archivo [LICENSE](LICENSE) para detalles

---
⌨️ con ❤️ por [ArthurDev](https://github.com/ArthurQR98) 😊
