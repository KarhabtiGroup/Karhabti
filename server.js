const express = require('express');
const mongoose = require('mongoose');
const morgan = require('morgan');
const bodyParser = require('body-parser');

const UtilisateurRoute=require('./routes/utilisateur')
const AuthentificationRoute=require('./routes/authentification')
const AnnonceRoute=require('./routes/annonce')
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

app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

const PORT = process.env.PORT || 3000

app.listen(PORT, () => {
    console.log(`Server is running on port: ${PORT}`);
});

app.use('/api/authentification', AuthentificationRoute)
app.use('/api/utilisateur', UtilisateurRoute)
app.use('/api/mecanicien', MecanicienRoute)
//app.use('/api/annonce', AnnonceRoute)
//app.use('/api/inspection', InspectionRoute)
app.use('/api/type', TypeRoute)
app.use('/api/sponsors', SponsorsRoute)
