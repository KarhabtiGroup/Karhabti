const mongoose = require('mongoose');
const Schema = mongoose.Schema;


const annonceSchema = new Schema({
    Title: {
        type: String,
    },
    Description: {
        type: String,
    },
    email: {
        type: String,
    },
    phoneNumber: {
        type: String,
    },
    birthDate: {
        type: Date,
    },
}, { timestamps: true});

const Annonce = mongoose.model('Annonce', annonceSchema);

module.exports = Annonce