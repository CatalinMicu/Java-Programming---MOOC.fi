/**
 *
 * This class represents the user interface for managing two containers.
 * 
 * Author: CiCi
 */

import java.util.Scanner;

public class UserInterface {
    private Container containerFirst;
    private Container containerSecond;
    private Scanner scanner;

    public UserInterface(Container containerFirst, Container containerSecond, Scanner scanner) {
        this.containerFirst = containerFirst;
        this.containerSecond = containerSecond;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("First: " + this.containerFirst.contains() + "/100");
            System.out.println("Second: " + this.containerSecond.contains() + "/100");
            String input = scanner.nextLine();
            String clona = input;
            if (clona.equals("quit")) {
                break;
            }

            String[] bucati = input.split(" ");
            String comanda = bucati[0];
            int cantitate = Integer.valueOf(bucati[1]);

            if (comanda.equals("add")) {
                if (cantitate <= 0) {
                    this.containerFirst.add(0);
                } else if (this.containerFirst.contains() + cantitate <= 100) {
                    this.containerFirst.add(cantitate);
                } else if (this.containerFirst.contains() + cantitate >= 100) {
                    this.containerFirst.add(100);
                }
            } else if (comanda.equals("move")) {
                if (cantitate <= 0) {
                    this.containerSecond.add(0);
                } else if (cantitate <= this.containerFirst.contains()) {
                    this.containerFirst.remove(cantitate);
                    this.containerSecond.add(cantitate);
                } else if (cantitate >= this.containerFirst.contains()) {
                    this.containerSecond.add(this.containerFirst.contains());
                    this.containerFirst.remove(100);
                }
                if (this.containerSecond.contains() > 100) {
                    this.containerSecond.add(100);
                }
            } else if (comanda.equals("remove")) {
                if (cantitate <= 0) {
                    this.containerSecond = this.containerSecond;
                } else if (cantitate <= this.containerSecond.contains()) {
                    this.containerSecond.remove(cantitate);
                } else if (cantitate >= this.containerSecond.contains()) {
                    this.containerSecond.remove(100);
                }
            }
        }
    }
}
