const express = require('express')
const router  = express.Router()

const AnnonceController = require('../controllers/AnnonceController')

router.get('/index',AnnonceController.index)
router.post('/show',AnnonceController.show)

router.post('/store',AnnonceController.store)
router.post('/update',AnnonceController.update)
router.post('/delete',AnnonceController.destory)

module.exports=router