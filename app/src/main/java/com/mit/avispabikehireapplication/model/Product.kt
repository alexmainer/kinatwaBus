package com.mit.avispabikehireapplication.model


class Product {
    var name:String=""
    var idNumber:String=""
    var type:String=""
    var quantity:String=""
    var date:String=""
    var id:String=""


    constructor(name:String, idNumber:String, type:String, quantity:String, date: String, id:String){
        this.name=name
        this.idNumber=idNumber
        this.type=type
        this.quantity=quantity
        this.date=date
        this.id=id

    }
    constructor(){}
}