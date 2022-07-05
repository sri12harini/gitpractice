package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Route;
import com.cg.service.RouteService;

@RestController
@RequestMapping("/route")
public class RouteController {

	@Autowired
	public RouteService routeService;
	
	@PostMapping
	public Route addRoute(@RequestBody Route route) {
		return routeService.addRoute(route);
	}
	@PutMapping("/{routeId}/{distance}")
	public Route updateRoute(@PathVariable("distance")int distance,@PathVariable("routeId")int routeId) {
		return routeService.updateRoute(routeId,distance);
	}
	@DeleteMapping("/{routeId}")
	public Route deleteRoute(@PathVariable("routeId")int routeId) {
		return routeService.deleteRoute(routeId);
	}
	@GetMapping("/{routeId}")
	public Route viewRoute(@PathVariable("routeId") int routeId) {
		return routeService.viewRoute(routeId);
	}
	@GetMapping
	public List<Route> viewAllroute() {
		return routeService.viewAllRoutes();
	}
}
	
