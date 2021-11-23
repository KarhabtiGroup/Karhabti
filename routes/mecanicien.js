const express = require('express')
const router  = express.Router()

const MecanicienController = require('../controllers/MecanicienController')

router.get('/',MecanicienController.index)
router.post('/show',MecanicienController.show)
router.get('/',MecanicienController.index)
router.post('/store',MecanicienController.store)
router.post('/update',MecanicienController.update)
router.post('/delete',MecanicienController.destory)

module.exports=router