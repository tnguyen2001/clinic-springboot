package com.dev.clinic.util;

import org.springframework.stereotype.Component;

@Component
public class CommonMethod {
    public static String getCurrentUsername() {
        // Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        // if (principal instanceof UserDetails) {
        //     String username = ((UserDetails) principal).getUsername();
        //     return username;
        // }
        return null;
    }
}
