package Enumeracoes;

import java.util.Date;

public class Pedido {
    private Integer id;
    private Date moment;
    private OrderStatus status;

    public Pedido(Integer id, Date moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String toString() {
        return "Id: " + this.id + " Data: " + this.moment + " Status: " + this.status;
    }
}
