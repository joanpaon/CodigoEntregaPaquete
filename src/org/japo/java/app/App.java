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

import java.util.Scanner;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class App {

    // Entrada al Mecanismo Funcional
    public void launchApp() {
        // Objeto Scanner
        Scanner scn = new Scanner(System.in, "ISO-8859-1");

        try {
            // Acrónimo Módulo
            System.out.print("Acrónimo módulo ....: ");
            String acr = scn.nextLine().trim().toUpperCase();

            // Número de lista
            System.out.print("Número de lista ....: ");
            int lst = scn.nextInt();
            scn.nextLine();

            // Primer Apellido
            System.out.print("Primer Apellido ....: ");
            String ape = scn.nextLine();
            ape = (ape.charAt(0) + "").toUpperCase() + ape.substring(1).toLowerCase();
            
            // Inicial(es) Nombre
            System.out.print("Inicial(es) nombre .: ");
            String nom = scn.nextLine().toUpperCase();

            // Código de entrega
            System.out.printf("Código de entrega ..: %s_%02d_%s%s%n", acr, lst, ape, nom);
        } catch (Exception e) {
            System.out.println("ERROR: Entrada incorrecta");
        }
    }
}
