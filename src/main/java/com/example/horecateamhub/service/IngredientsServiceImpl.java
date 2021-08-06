//package com.example.horecateamhub.service;
//
//import com.example.horecateamhub.exception.RecordNotFoundException;
//import com.example.horecateamhub.model.Ingredient;
//import com.example.horecateamhub.model.Recept;
//import com.example.horecateamhub.repository.IngredientsRepository;
//import com.example.horecateamhub.repository.ReceptRepository;
//import com.example.horecateamhub.requests.IngredientsRequest;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class IngredientsServiceImpl implements IngredientsService {
//    private IngredientsRepository ingredientsRepository;
//
//    @Autowired
//    private ReceptRepository receptRepository;
//
//    @Autowired
//    public IngredientsServiceImpl(IngredientsRepository ingredientsRepository) {
//        this.ingredientsRepository = ingredientsRepository;
//    }
//
//    @Override
//    public List<Ingredient> getAllIngredients() {
//        return ingredientsRepository.findAll();
//    }
//
//    @Override
//    public Ingredient getIngredients(Long id) {
//        var optionalIngredients = ingredientsRepository.findById(id);
//        if (optionalIngredients.isPresent()) {
//            return optionalIngredients.get();
//        } else throw new RecordNotFoundException();
//    }
//
//    @Override
//    public Ingredient saveIngredients(Ingredient ingredient) {
//       return ingredientsRepository.save(ingredient);
//    }
//
//    @Override
//    public void deleteIngredients(Long id) {
//    ingredientsRepository.deleteById(id);
//    }
//
//    @Override
//    public Ingredient addIngredients(IngredientsRequest ingredientsRequest) {
//        Optional<Recept> optionalRecept = receptRepository.findById(ingredientsRequest.id);
//        if (optionalRecept.isPresent()) {
//            Recept recept = optionalRecept.get();
//            Ingredient ingredients = new Ingredient();
//            ingredients.setIngredientName(ingredientsRequest.name);
//
//            ingredients.setRecept(recept);
////            recept.getIngredients().add(ingredients);
//            receptRepository.save(recept);
//            return ingredientsRepository.save(ingredients);
//        } else throw new RecordNotFoundException();
//    }
//
//
//}
//
//
