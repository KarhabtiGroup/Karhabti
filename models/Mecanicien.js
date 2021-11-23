const mongoose = require('mongoose');
const Schema = mongoose.Schema;


const mecanicienSchema = new Schema({
    name: {
        type: String,
    },
    Adress: {
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

const Mecanicien = mongoose.model('Mecanicien', mecanicienSchema);

module.exports = Mecanicien