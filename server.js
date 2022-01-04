const express = require('express');
const mongoose = require('mongoose');
const morgan = require('morgan');
const bodyParser = require('body-parser');

const UtilisateurRoute=require('./routes/utilisateur')
const AuthentificationRoute=require('./routes/authentification')
const AnnonceRoute=require('./routes/Annonce')
const MecanicienRoute=require('./routes/Mecanicien')
const InspectionRoute=require('./routes/annonce')
const TypeRoute=require('./routes/type')
const SponsorsRoute=require('./routes/sponsors')

mongoose.connect('mongodb://localhost:27017/testdb',{useNewUrlParser: true, useUnifiedTopology: true})
const db = mongoose.connection

db.on('error',(err) => {
    console.log(err)
    console.log("Error")
})


db.once('open', () => {
    console.log('Database Connection Established!')
})

const app = express();

app.use(morgan('dev'))


app.use(bodyParser.json({
   limit: '50mb'
}));
app.use(bodyParser.urlencoded({
   limit: '50mb',
   extended: true
}));
const PORT = process.env.PORT || 3000

app.listen(PORT, () => {
    console.log(`Server is running on port: ${PORT}`);
});
app.use('/api/Annonce', AnnonceRoute)
app.use('/api/authentification', AuthentificationRoute)
app.use('/api/utilisateur', UtilisateurRoute)
app.use('/api/mecanicien', MecanicienRoute)
//app.use('/api/inspection', InspectionRoute)
app.use('/api/type', TypeRoute)
app.use('/api/sponsors', SponsorsRoute)
