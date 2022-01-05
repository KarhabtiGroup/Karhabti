const Annonce = require('../models/Annonce')

const index=(req, res, next) => 
{
    Annonce.find()
    .then((annonce) =>{res.json({annonce})})
    .catch(error=>{res.json({error})})      
}

const show = (req, res, next) => {
    let annonceID = req.body.annonceID
    Annonce.findById(annonceID)
    .then(response => {
        res.json({
            response
        })
    })
    .catch(error => {
        res.json({
            message:'an error Occured'
        })
    })
}




const store = (req, res, next) => {
    

    let annonce= new Annonce({
        titre:req.body.titre,
        marque:req.body.marque,
        prix:req.body.prix,
        date:req.body.date,
        gouvernorat:req.body.gouvernorat,
        delegation:req.body.delegation,
        description:req.body.description

    })

        
    console.log(annonce)

    annonce.save()
    .then(response => {
        res.json({
            message:'Annonce Added Sucessfull!'
        })
    })
.catch(eroor => {
    res.json({
        message:'an error Occured!'
    })
})
}






//update an Annonce
const update =(req, res, next)=>
{
    let annonceID=req.body.annonceID
    let updateData={
        titre:req.body.titre,
        marque:req.body.marque,
        prix:req.body.prix,
        date:req.body.date,
        gouvernorat:req.body.gouvernorat,
        delegation:req.body.delegation,
        description:req.body.description
    }
    Annonce.findByIdAndUpdate(annonceID, {$set:updateData})
    .then(()=>{
        res.json( {
            message:'Annonce updated successfully!'
        })
    })
.catch(error =>{
    res.json({
        message:'an error Occured!'
    })
})
}


//delete an Annonce

const destory=(req,res,next) =>{
    let annonceID= req.body.annonceID
    Annonce.findByIdAndRemove(annonceID)
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