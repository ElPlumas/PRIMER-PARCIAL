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
        
        GregorianCalendar date = new GregorianCalendar();
        
        CertificateOfDeposit cD1 = new CertificateOfDeposit(366, "Julián Almaraz", 450.21, date);
        cD1.setMaturityDate();
        
        CertificateOfDeposit cD2 = new CertificateOfDeposit(654, "Martha Zúñiga", 723.5, date);
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
