/*
 * Copyright 2017 José A. Pacheco Ondoño - joanpaon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class App {

    // Entrada al Mecanismo Funcional
    public void launchApp() {
        // Datos Constantes
        final String ACR_MODU = "PRG";
        final int NUM_ALUM = 13;
        final String APE_ALUM = "Pallarés";
        final String NOM_ALUM = "JV";

        // Cabecera
        System.out.println("DATOS DE ENTREGA");
        System.out.println("================");

        // Datos individuales
        System.out.printf("Acrónimo módulo ....: %s%n", ACR_MODU);
        System.out.printf("Número de lista ....: %s%n", NUM_ALUM);
        System.out.printf("Primer Apellido ....: %s%n", APE_ALUM);
        System.out.printf("Inicial(es) nombre .: %s%n", NOM_ALUM);
        
        // Separador
        System.out.println("---");

        // Código de entrega
        System.out.printf("Código de entrega ..: %s_%02d_%s%s%n",
                ACR_MODU, NUM_ALUM, APE_ALUM, NOM_ALUM);
    }
}
