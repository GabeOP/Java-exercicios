package entities;

public class OutsourcedEmployee extends Employee{
    private Double additionalCharge;

    public OutsourcedEmployee(){}

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge){
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment(){
        Double teste = super.payment();
        Double percent = additionalCharge * 10 / 100;
        return teste + additionalCharge + percent;
    }
}
