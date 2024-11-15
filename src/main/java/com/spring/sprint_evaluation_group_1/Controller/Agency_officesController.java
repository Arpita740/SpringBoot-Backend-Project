//package com.spring.sprint_evaluation_group_1.Controller;
//
//import java.util.List;
//<<<<<<< HEAD
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//=======
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//>>>>>>> 18e912e9711629004667724788d5acca8ef2e161
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.spring.sprint_evaluation_group_1.Service.Agency_officesServices;
//<<<<<<< HEAD
//import com.spring.sprint_evaluation_group_1.entity.Agency_office;
//
//@RestController
//@RequestMapping("/api/agencies/offices")
//public class Agency_officesController {
////    @Autowired
////    private Agency_officesServices agencyOfficeService;
////
////    @GetMapping("/{agency_id}")
////    public Optional<List<Agency_office>> getOfficesByAgencyId(@PathVariable Long agency_id) {
////        return ResponseEntity.ok(agencyOfficeService.getOfficesByAgencyId(agency_id));
////    }
////
////    @GetMapping("/{office_id}")
////    public ResponseEntity<Office> getOfficeById(@PathVariable Long office_id) {
////        return ResponseEntity.ok(agencyOfficeService.getOfficeById(office_id));
////    }
////
////    @GetMapping
////    public ResponseEntity<List<Office>> getAllOffices() {
////        return ResponseEntity.ok(agencyOfficeService.getAllOffices());
////    }
//=======
//import com.spring.sprint_evaluation_group_1.entity.Office;
//>>>>>>> 18e912e9711629004667724788d5acca8ef2e161
//
//@RestController
//@RequestMapping("/api/agencies/offices")
//public class Agency_officesController {
//    @Autowired
//    private Agency_officesServices agencyOfficeService;
//
//    @GetMapping("/{agency_id}")
//    public ResponseEntity<List<Office>> getOfficesByAgencyId(@PathVariable Long agency_id) {
//        return ResponseEntity.ok(agencyOfficeService.getOfficesByAgencyId(agency_id));
//    }
//
//    @GetMapping("/{office_id}")
//    public ResponseEntity<Office> getOfficeById(@PathVariable Long office_id) {
//        return ResponseEntity.ok(agencyOfficeService.getOfficeById(office_id));
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Office>> getAllOffices() {
//        return ResponseEntity.ok(agencyOfficeService.getAllOffices());
//    }
//}
