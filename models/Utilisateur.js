const mongoose = require('mongoose');
const Schema = mongoose.Schema;


const utilisateurSchema = new Schema({
    name: {
        type: String,
    },
    passwordHash: {
        type: String,
    },
    email: {
        type: String,
    },
    confirmPassword: {
        type: String,
    },
    phoneNumber: {
        type: String,
    },
    birthDate: {
        type: Date,
    },
    image: {
        type: String,
    },
}, { timestamps: true});

const Utilisateur = mongoose.model('Utilisateur', utilisateurSchema);

module.exports = Utilisateur