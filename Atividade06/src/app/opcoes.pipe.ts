import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'opcoes'
})
export class OpcoesPipe implements PipeTransform {

  transform(value: any, ...args: any[]): any {
    return null;
  }

}
