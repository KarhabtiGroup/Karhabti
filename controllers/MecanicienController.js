const Mecanicien = require('../models/Mecanicien')
const index=(req, res, next) => 
{
    Mecanicien.find()
    .then(reponse =>{
        res.json({
        response
         })
    })
 .catch(error=>{
     res.json({
        error
    })
 })   
}
const show = (req, res, next) => {
    let mecanicienID = req.body.mecanicienID
    Mecanicien.findById(mecanicienID)
    .then(reponse => {
        res.json({
            reponse
        })
    })
    .catch(error => {
        res.json({
            message:'an error Occured'
        })
    })
}


const store = (req, res, next) => {

    let Mecanicien= new Mecanicien({
        name:req.body.name,
        email:req.body.email,
        phoneNumber:req.body.phoneNumber,
        birthDate:req.body.birthDate
    })
    mecanicien.save()
    .then(response => {
        res.json({
            message:'Mecanicien Added Sucessfull!'
        })
    })
.catch(eroor => {
    res.json({
        message:'an error Occured!'
    })
})
}


//update an Mecanicien
const update =(req, res, next)=>
{
    let mecanicienID=req.body.mecanicienID
    let updateData={
        name:req.body.name,
        email:req.body.email,
        phoneNumber:req.body.phoneNumber,
        birthDate:req.body.birthDate
    }
    Mecanicien.findByIdAndUpdate(mecanicienID, {$set:updateData})
    .then(()=>{
        res.json( {
            message:'Mecanicien updated successfully!'
        })
    })
.catch(error =>{
    res.json({
        message:'an error Occured!'
    })
})
}


//delete an mecanicien

const destory=(req,res,next) =>{
    let mecanicienID= req.body.mecanicienID
    Mecanicien.findByIdAndRemove(mecanicienID)
    .then(()=>{
        req.json({
            message: 'an error Occured!'
        })
    })
    .catch(error =>{
        res.json({
            message:'an error Occured!'
        })
    })
}

module.exports={
    index,show,store,update,destory

}