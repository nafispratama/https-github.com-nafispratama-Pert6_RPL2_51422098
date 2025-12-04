/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Nafis
 */


public class MahasiswaController {




    private MahasiswaService mahasiswaService;


    // Add new Mahasiswa

    public String addMahasiswa(@RequestBody ModelMahasiswa mhs) {

        mahasiswaService.addMhs(mhs);

        return "Mahasiswa added successfully";

    }


    // Get Mahasiswa by ID

    public ModelMahasiswa getMahasiswa(@PathVariable int id) {

        return mahasiswaService.getMhs(id);

    }


    // Update Mahasiswa

    public String updateMahasiswa(@RequestBody ModelMahasiswa mhs) {

        mahasiswaService.updateMhs(mhs);

        return "Mahasiswa updated successfully";

    }


    // Delete Mahasiswa by ID

    public String deleteMahasiswa(@PathVariable int id) {

        mahasiswaService.deleteMhs(id);

        return "Mahasiswa deleted successfully";

    }


    // Get all Mahasiswa

    public List<ModelMahasiswa> getAllMahasiswa() {

        return mahasiswaService.getAllMahasiswa();

    }

}