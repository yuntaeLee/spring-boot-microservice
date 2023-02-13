package com.msa.inventoryservice.controller;

import com.msa.inventoryservice.dto.InventoryResponse;
import com.msa.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> getInventory(@RequestParam List<String> skuCode) {
        return inventoryService.getInventory(skuCode);
    }
}
