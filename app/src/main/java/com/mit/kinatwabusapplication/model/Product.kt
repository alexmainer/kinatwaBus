package com.mit.kinatwabusapplication.model


class Product {
    var name:String=""
    var idNumber:String=""
    var selectedbusroute:String=""
    var tickets:String=""
    var date: String=""
    var id:String=""


    constructor(name:String, idNumber:String, selectedbusroute:String, tickets:String, date:String, id:String){
        this.name=name
        this.idNumber=idNumber
        this.selectedbusroute=selectedbusroute
        this.tickets=tickets
        this.date= date
        this.id=id

    }
    constructor(){}
}