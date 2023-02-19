package com.example.stockmanagement.productservice.exception.exceptions;

import com.example.stockmanagement.productservice.enums.Language;
import com.example.stockmanagement.productservice.exception.enums.IFriendlyMessageCode;
import com.example.stockmanagement.productservice.exception.utils.FriendlyMessageUtils;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class ProductNotCreatedException extends RuntimeException{
    private final Language language;
    private final IFriendlyMessageCode iFriendlyMessageCode;

    public ProductNotCreatedException(Language language, IFriendlyMessageCode iFriendlyMessageCode, String message) {
        super(FriendlyMessageUtils.getFriendlyMessage(language,iFriendlyMessageCode));
        this.language = language;
        this.iFriendlyMessageCode = iFriendlyMessageCode;
        log.error("[ProductNotCreatedException] -> message: {} developer message: {}", FriendlyMessageUtils.getFriendlyMessage(language,iFriendlyMessageCode),message);
    }
}
