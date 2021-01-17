package com.taozi.day04.importer;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/16 17:27
 */
@Import(CustomImportSelector.class)
public class CustomImport {
}
