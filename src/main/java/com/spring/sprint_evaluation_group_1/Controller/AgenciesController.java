//
//package com.spring.sprint_evaluation_group_1.Controller;
//
//import java.util.List;
//<<<<<<< HEAD
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.spring.sprint_evaluation_group_1.Service.AgenciesServices;
//import com.spring.sprint_evaluation_group_1.entity.Agency;
//
//@RestController
//public class AgenciesController {
//	 @Autowired
//	    private AgenciesServices agenciesService;
//
//	    
//	    @GetMapping("/{agency_id}")
//	    public Optional<Agency> getAgencyById(@PathVariable("agency_id") int agencyId) {
//	        return agenciesService.getAgencyById(agencyId);
//	    }
//
//	   
//	    @GetMapping
//	    public List<Agency> getAllAgencies() {
//	        return agenciesService.getAllAgencies();
//	    }
//	
//
//=======
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.spring.sprint_evaluation_group_1.Service.Agency_officesServices;
//import com.spring.sprint_evaluation_group_1.entity.Agency;
//>>>>>>> 18e912e9711629004667724788d5acca8ef2e161
//
//@RestController
//@RequestMapping("/api/agencies")
//public class AgenciesController {
//	@Autowired
//    private Agency_officesServices agencyService;
//
//    @GetMapping("/{agency_id}")
//    public ResponseEntity<Agency> getAgencyById(@PathVariable Long agency_id) {
//        return ResponseEntity.ok(agencyService.getAgencyById(agency_id));
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Agency>> getAllAgencies() {
//        return ResponseEntity.ok(agencyService.getAllAgencies());
//    }
//}
