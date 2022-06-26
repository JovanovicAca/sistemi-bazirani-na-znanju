import { TestBed } from '@angular/core/testing';

import { NbtService } from './nbt.service';

describe('NbtService', () => {
  let service: NbtService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(NbtService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
