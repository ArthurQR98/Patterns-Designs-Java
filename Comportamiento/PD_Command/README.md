# Patterns Desings -Command- with Java 馃殌

El patr贸n Command tiene como objetivo transformar una solicitud en un objeto,
facilitando operaciones tales como la anulaci贸n, el encolamiento de solicitudes y su seguimiento.

## Use Case

* Un objeto debe configurarse para realizar un procesamiento concreto. En el caso
del patr贸n Command, es el solicitante el que se configura mediante una solicitud
que contiene la descripci贸n de un procesamiento a realizar sobre uno o varios
receptores.
* Las solicitudes deben encolarse y poder ejecutarse en un momento cualquiera,
eventualmente varias veces.
* Las solicitudes pueden ser anuladas.
* Las solicitudes deben quedar registradas en un archivo de log.
* Las solicitudes deben estar reagrupadas bajo la forma de una transacci贸n. Una
transacci贸n es un conjunto ordenado de solicitudes que act煤an sobre el estado de
un sistema y que pueden ser anuladas.


### Pre-requisitos 馃搵

* [Java](https://www.java.com/es/download/) 

## Construido con 馃洜锔?

* [Java](https://www.java.com/es/download/)

## Licencia 馃搫

Este proyecto est谩 bajo la Licencia - mira el archivo [LICENSE](LICENSE) para detalles

---
鈱笍 con 鉂わ笍 por [ArthurDev](https://github.com/ArthurQR98) 馃槉
