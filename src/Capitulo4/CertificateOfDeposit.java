package Capitulo4;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class CertificateOfDeposit {

    Integer certificateNumber;
    String lastName;
    Double balance;
    GregorianCalendar issueDate = new GregorianCalendar();
    GregorianCalendar maturityDate = new GregorianCalendar();

    public CertificateOfDeposit(Integer certificateNumber, String lastName, Double balance, GregorianCalendar issueDate) {
        this.certificateNumber = certificateNumber;
        this.lastName = lastName;
        this.balance = balance;
        this.issueDate = issueDate;
    }
    
    public Integer getCertificateNumber () {
        return certificateNumber;
    }
    
    public void setCertificateNumber (Integer certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public GregorianCalendar getIssueDate() {
        return issueDate;
    }

    public GregorianCalendar getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate() {
        Integer year = issueDate.get(GregorianCalendar.YEAR) + 1;
        this.maturityDate.set(year, issueDate.get(GregorianCalendar.MONTH), issueDate.get(GregorianCalendar.DATE));
        
    }
    
    public static void main(String[] args) {
        
        Integer numero1, numero2;
        String nombre1, nombre2;
        Double saldo1,saldo2;
        Integer dia1, dia2, mes1, mes2, anio1, anio2;
        
        GregorianCalendar date1 = new GregorianCalendar();
        GregorianCalendar date2 = new GregorianCalendar();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("CERTIFICADO 1\nNúmero del certificado: ");
        numero1 = scanner.nextInt();
        System.out.println("Nombre: ");
        nombre1 = scanner.nextLine();
        System.out.print("Saldo: ");
        saldo1 = scanner.nextDouble();
        System.out.print("FECHA\nAño: ");
        anio1 = scanner.nextInt();
        System.out.print("Mes: ");
        mes1 = scanner.nextInt();
        System.out.print("Día: ");
        dia1 = scanner.nextInt();
        
        date1.set(anio1, mes1, dia1);
        CertificateOfDeposit cD1 = new CertificateOfDeposit(numero1, nombre1, saldo1, date1);
        cD1.setMaturityDate();
        
        System.out.print("CERTIFICADO 2\nNúmero del certificado: ");
        numero2 = scanner.nextInt();
        System.out.print("Nombre: ");
        nombre2 = scanner.nextLine();
        System.out.print("Saldo: ");
        saldo2 = scanner.nextDouble();
        System.out.print("FECHA\nAño: ");
        anio2 = scanner.nextInt();
        System.out.print("Mes: ");
        mes2 = scanner.nextInt();
        System.out.print("Día: ");
        dia2 = scanner.nextInt();
        
        date2.set(anio2, mes2, dia2);
        CertificateOfDeposit cD2 = new CertificateOfDeposit(numero2, nombre2, saldo2, date2);
        cD2.setMaturityDate();
        
        System.out.println("CERTIFICADO 1\nNúmero de certificado: "
                + cD1.getCertificateNumber()
                + "\nNombre: " + cD1.getLastName()
                + "\nSaldo: " + cD1.getBalance() +
                "\nFecha de registro: " + cD1.getIssueDate().get(GregorianCalendar.DATE) +
                "/" + cD1.getIssueDate().get(GregorianCalendar.MONTH) + "/"
                + cD1.getIssueDate().get(GregorianCalendar.YEAR) +
                "\nFecha de vencimiento: " + cD1.getMaturityDate().get(GregorianCalendar.DATE)+
                "/" + cD1.getMaturityDate().get(GregorianCalendar.MONTH) +
                "/" + cD1.getMaturityDate().get(GregorianCalendar.YEAR));
        System.out.println("CERTIFICADO 2\nNúmero de certificado: "
                + cD2.getCertificateNumber()
                + "\nNombre: " + cD2.getLastName()
                + "\nSaldo: " + cD2.getBalance() +
                "\nFecha de registro: " + cD2.getIssueDate().get(GregorianCalendar.DATE) + "/"
                + cD2.getIssueDate().get(GregorianCalendar.MONTH)+"/"
                + cD2.getIssueDate().get(GregorianCalendar.YEAR) +
                "\nFecha de vencimiento: " + cD2.getMaturityDate().get(GregorianCalendar.DATE)
                + "/" + cD2.getMaturityDate().get(GregorianCalendar.MONTH) +
                "/" + cD2.getMaturityDate().get(GregorianCalendar.YEAR));
        
    }
    
}
